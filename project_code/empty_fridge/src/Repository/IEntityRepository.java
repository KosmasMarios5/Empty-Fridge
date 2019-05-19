/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import java.util.ArrayList;

/**
 *
 * @author kosma
 */
public interface IEntityRepository<TEntity> {
    TEntity load(int id);
    ArrayList<TEntity> loadMultiple();
    TEntity create(TEntity entity);
    TEntity update(TEntity entity);
    boolean delete(TEntity entity);
}
