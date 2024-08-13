package cl.bethelper.main.handler;

import cl.bethelper.main.dto.RequestFixturesDTO;
import cl.bethelper.main.util.BetBusinessUtil;
import cl.bethelper.main.util.JSONUtil;
import cl.bethelper.main.util.StringUtil;
import cl.bethelper.main.vo.Root;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

import java.io.InputStream;

public class StatsByFixtureHandler implements RequestHandler<RequestFixturesDTO, Object> {

    @Override
    public Root handleRequest(RequestFixturesDTO input, Context context) {
        LambdaLogger logger = context.getLogger();

        logger.log("Recibiendo " + input.toString());

        Root root = new Root();
        try{
            if (!StringUtil.validateInputFixtures(input)){
                logger.log("Se deben ingresar los valores de consulta");

                return root;
            }
            AmazonS3 s3Client = AmazonS3Client.builder().build();
            String prefix = BetBusinessUtil.getPrefix(input.getLeague(), input.getSeason());
            String keyName = prefix + "/" + input.getId_fixture() + ".json";

            logger.log(" bucketName -> " + BetBusinessUtil.BUCKET_FIXTURES);
            logger.log(" prefix -> " + prefix);
            logger.log(" keyName -> " + keyName);

            S3Object response = s3Client.
                    getObject(new GetObjectRequest(BetBusinessUtil.BUCKET_FIXTURES, keyName));
            InputStream objectData = response.getObjectContent();

            root = JSONUtil.readJSONFixtures(objectData);
        }catch (Exception e){
            logger.log("Error: " + e.getMessage());
        }
        return root;
    }
}
