/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository.Test;

import Repository.IEntityRepository;
import empty_fridge.Entities.Entity;
import empty_fridge.Entities.Recipe;
import java.util.ArrayList;

/**
 *
 * @author kosma
 */
public abstract class TestEntityRepositoryBase<TEntity extends Entity> implements IEntityRepository<TEntity>{

    protected ArrayList<TEntity> entities = new ArrayList<TEntity>();

    public TEntity load(int id) {
        for (TEntity entity : this.entities) {
            if(entity.getId() == id)
                return entity;
                }
        return null;           
    }
    
    public ArrayList<TEntity> loadMultiple(){
        return this.entities;
    }
    
    public TEntity create(TEntity entity) {
        this.entities.add(entity);
        return entity;
    }
    
    public TEntity update(TEntity entity) {
        int index = this.entities.indexOf(entity);
        if(index == -1){
           return null;
        }
        this.entities.set(index, entity);
        return entity;
    }
    
    public boolean delete(TEntity entity) {
        return this.entities.remove(entity);
    }
}

