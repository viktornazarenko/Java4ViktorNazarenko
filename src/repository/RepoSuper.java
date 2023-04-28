package repository;

import entities.EntitySuper;

import java.util.Arrays;


public class RepoSuper {

    private static EntitySuper[] repos;

    private static int i = 0;

    public static void create(final int length) {
        if (repos != null && repos.length > 0){
            return;
        }
        repos = new EntitySuper[length];
    }

    public static void add(EntitySuper entity){
        EntitySuper[] repos1 = Arrays.copyOf(repos, (repos.length*3)/2 + 1);
        repos = repos1;
        repos[i] = entity;
        i++;
    }

    public static EntitySuper[] getAll(){
        return repos;
    }

    public static EntitySuper getByld(int i){
        return repos[i];
    }

    public static void deleteByld(int index){

        EntitySuper[] copy = new EntitySuper[repos.length - 1];
        for (int j = 0, k = 0; j < repos.length; j++) {
            if (j != index){
                copy[k++] = repos[j];
            }

        }
        repos = copy;
    }
}
