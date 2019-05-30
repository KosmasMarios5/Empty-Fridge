/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empty_fridge.Pages;

import Repository.IEntityRepository;
import Repository.Test.TestCommentRepository;
import Repository.Test.TestImageRepository;
import empty_fridge.Entities.*;


/**
 *
 * @author Kostis
 */
public class RecipeRatePage extends Page {

   int rating;
   IEntityRepository<Comment> commentRepository;
   IEntityRepository<Image> imageRepository;
   Comment comment;
           
   public RecipeRatePage(){
       this.commentRepository = new TestCommentRepository(); 
       this.imageRepository = new TestImageRepository(); 
   }
   
   
   public void createComment(String text){
       
       Comment comment = new Comment();
       comment.saveComment(text);
       Comment createdComment =  this.commentRepository.create(comment);
       if(createdComment == null){
           this.error("Comment not saved. Try again later.");
       }
       
       this.display();
   }
   
   public void rateRecipe(int rating, Recipe recipe){
       
       recipe.saveRating(rating);
       this.display();
   
   
   }
   
   
   public void submitPhoto(Image image){
       Comment comment = new Comment();
       comment.savePhoto(image);
      
       Comment createdComment =  this.commentRepository.create(comment);
       Image createdImage =  this.imageRepository.create(image);
       if(createdComment == null || createdImage == null){
           this.error("Comment not saved. Try again later.");
       }
       this.display();
       
   }
}
