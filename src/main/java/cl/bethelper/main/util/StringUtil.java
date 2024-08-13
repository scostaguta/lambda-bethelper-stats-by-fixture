package cl.bethelper.main.util;

import cl.bethelper.main.dto.RequestFixturesDTO;

public class StringUtil {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean validateInputFixtures(RequestFixturesDTO input){
        if (StringUtil.isNullOrEmpty(input.getLeague())) return false;
        if (StringUtil.isNullOrEmpty(input.getSeason())) return false;
        if (StringUtil.isNullOrEmpty(input.getId_fixture())) return false;
        return true;
    }
}
