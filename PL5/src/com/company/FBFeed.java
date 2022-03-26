package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FBFeed {
    ArrayList<FBPost> feed;

    public int nrPosts(String user){
        int count = 0;
        for(FBPost post : this.feed){
            if (user.equals(post.username)){
                count++;
            }
        }
        return count;
    }

    public List<FBPost> postsOf(String user){
        List<FBPost> posts = new ArrayList<FBPost>();
        for(FBPost post : this.feed){
            if (user.equals(post.username)){
                posts.add(post);
            }
        }
        return posts;
    }

    private boolean verificaDatas(FBPost post, LocalDateTime inicio, LocalDateTime fim){
        boolean res = false;
        if (post.date.getYear() > inicio.getYear() && post.date.getYear() < fim.getYear()) res = true;
        else if (inicio.getYear() == fim.getYear() && post.date.getYear() == inicio.getYear() && post.date.getMonthValue() > inicio.getMonthValue() && post.date.getMonthValue() < fim.getMonthValue()) res = true;
        else if (inicio.getYear() == fim.getYear() && inicio.getMonthValue() == fim.getMonthValue() && inicio.getYear() == post.date.getYear() && inicio.getMonthValue() == post.date.getMonthValue() && post.date.getDayOfMonth() > inicio.getDayOfMonth() && post.date.getDayOfMonth() < fim.getDayOfMonth()) res = true;
        return res;
    }

    public List<FBPost> postsOf(String user, LocalDateTime inicio, LocalDateTime fim){
        List<FBPost> posts = new ArrayList<FBPost>();
        for(FBPost post : this.feed){
            if (user.equals(post.username) && verificaDatas(post,inicio,fim)){
                posts.add(post);
            }
        }
        return posts;
    }

    public FBPost getPost(int id){
        FBPost post = new FBPost();
        boolean ver = false;
        Iterator<FBPost> it = this.feed.iterator();
        while(it.hasNext() && !ver){
            FBPost p = it.next();
            if (p.id == id) {
                post = p;
                ver = true;
            }
        }
        return post;
    }

    public void comment(FBPost post, String comentario){
        Iterator<FBPost> it = this.feed.iterator();
        boolean ver = false;
        while(it.hasNext() && !ver){
            FBPost p = it.next();
            if (post.equals(p)) {
                ver = true;
                p.comentarios.add(comentario);
            }
        }
    }

    public void comment(int postid, String comentario){
        Iterator<FBPost> it = this.feed.iterator();
        boolean ver = false;
        while(it.hasNext() && !ver){
            FBPost p = it.next();
            if (p.id == postid) {
                ver = true;
                p.comentarios.add(comentario);
            }
        }
    }

    // Testar funções e fazer 7,8,9

}
