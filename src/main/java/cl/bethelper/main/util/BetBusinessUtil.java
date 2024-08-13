package cl.bethelper.main.util;

import cl.bethelper.main.vo.Response;
import cl.bethelper.main.vo.Root;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BetBusinessUtil {
    public static final String BUCKET_FIXTURES = "fixturesbucket";

    public static final String BUCKET_FIXTURES_PATH= "%league_id%-league/%season_id%-season/stats";

    /**
     *
     * @param league
     * @param season
     * @return
     */
    public static String getPrefix(String league, String season){
        if (league == null || season==null) return null;
        String prefix = BUCKET_FIXTURES_PATH.
                replace("%league_id%", league).
                replace("%season_id%", season);

        return prefix;
    }
}
