package ind.hy.nuts.beetlsql;

import lombok.NoArgsConstructor;
import org.beetl.sql.core.SQLManager;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author haoyun.zheng
 */
@NoArgsConstructor
public class SqlKitHolder implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SQLManager sqlManager = (SQLManager) applicationContext.getBean("sqlManagerFactoryBean");
        SQLKit.setSqlManager(sqlManager);
    }

}
