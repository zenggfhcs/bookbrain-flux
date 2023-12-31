package lib.bookbrain.dao;

import lib.bookbrain.model.BaseEntity;
import lib.bookbrain.model.Filter;
import lib.bookbrain.model.Payload;

import java.util.List;

public interface BaseMapper<T extends BaseEntity> {
/**
 * 通过 id 获取
 * @param payload 载荷
 * @return 单个对象
 */
T getById(Payload<T> payload);

/**
 * 获取
 * @param payload 载荷
 * @param filter 过滤对象
 * @return 多个对象
 */
List<T> getBy(Payload<T> payload, Filter filter);

/**
 * 更新
 * @param payload 载荷
 * @return 更新结果
 */
int update(Payload<T> payload);

/**
 * 创建
 * @param payload 载荷
 * @return 创建结果
 */
int create(Payload<T> payload);

/**
 * 删除
 * @param payload 载荷
 * @return 删除结果
 */
int delete(Payload<T> payload);

/**
 * 获取通过更新
 * @param payload 载荷
 * @return 根据更新内容获取的对象
 */
T getByUpdate(Payload<T> payload);
}
