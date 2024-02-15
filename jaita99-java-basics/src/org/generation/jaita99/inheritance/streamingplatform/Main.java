package org.generation.jaita99.inheritance.streamingplatform;

public class Main {

  public static void main(String[] args) {
    int x = 4;

    Content content = new Content("Java class");
    //content.setTitle("Java class");
    content.play();
    System.out.println(content.toString());



    Series javaSeries = new Series("Java playlist", 1, 10);
    /*javaSeries.setTitle("Java playlist");
    javaSeries.setSeason(1);
    javaSeries.setNumberOfEpisode(10);*/
    javaSeries.play();
    System.out.println(javaSeries);


    Movie avatar = new Movie("Avatar", 2500);
    /*avatar.setTitle("Avatar");
    avatar.setLength(2500);*/
    avatar.play();
    System.out.println(avatar);


    // posso unire in un array oggetti diversi purchè abbiano una superclasse in comune
    Content[] playlist = {content, javaSeries, avatar};

    for (int i = 0; i < playlist.length; i++) {
      playlist[i].play();
    }


  }
}
