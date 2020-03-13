package ind.hy.nuts.beetlsql;

import org.beetl.sql.core.SQLManager;

/**
 * @author haoyun.zheng
 */
public class SQLKit {

    private static SQLManager sqlManager;

    public static void setSqlManager(SQLManager sqlManager) {
        SQLKit.sqlManager = sqlManager;
    }

    public static SQLManager getSqlManager() {
        return sqlManager;
    }

    public static <T> T mapper(Class<T> mapperInterface) {
        return sqlManager.getMapper(mapperInterface);
    }

}
