/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

/**
 *
 * @author kosma
 */
public interface IEntityRepository<TEntity> {
    TEntity load(int id);
    TEntity create(TEntity entity);
    TEntity update(TEntity entity);
    boolean delete(TEntity entity);
}
