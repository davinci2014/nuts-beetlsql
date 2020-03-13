package ind.hy.nuts.beetlsql;

/**
 * @author haoyun.zheng
 */
public interface ActiveRecord {

    /**
     * 更新时间戳
     */
    default void updateStamp() {

    }

    /**
     * 创建时间戳
     */
    default void createStamp() {

    }

    /**
     * 新增保存记录
     *
     * @return true: 成功; false: 失败
     */
    default boolean save() {
        this.createStamp();
        return SQLKit.getSqlManager().insertTemplate(this) > 0;
    }

    /**
     * 新增保存记录并获取自增ID
     *
     * @return true: 成功; false: 失败
     */
    default boolean saveDo() {
        this.createStamp();
        return SQLKit.getSqlManager().insertTemplate(this, true) > 0;
    }

    /**
     * 更新记录, 只更新非NULL值字段
     *
     * @return true: 成功; false: 失败
     */
    default boolean update() {
        return SQLKit.getSqlManager().updateTemplateById(this) > 0;
    }

}
