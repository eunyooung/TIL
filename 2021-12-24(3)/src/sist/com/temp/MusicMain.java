package sist.com.temp;

// 임시 => 데이터 수집 => 파일 , 오라클 
// 1. 데이터 수집 
// 2. ArrayList에 대입 
// 3. ArrayList를 파일에 저장
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import sist.com.music.*;// 사용자 정의 클래스 로딩

// 패키지가 다르면 => import를 이용해서 필요한 클래스를 읽어 온다 
/*
*     <input type="checkbox" class="select-check" title="All I Want for Christmas Is You"></td>
           <td class="number">1
            <span class="rank">
              <span class="rank">3<span class="rank-none">
              <span class="hide">상승</span></span></span>
           </span>
           </td>
           <td>
            <a href="#" class="cover" onclick="fnViewAlbumLayer('80384589');return false;"><span class="mask"></span><img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/080/384/589/80384589_1572569104266_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="Merry Christmas (Deluxe Anniversary Edition)"></a></td>
            <td class="link">
            <a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo('82146674');return false;">곡 제목 정보 페이지</a></td>
           <td class="info">
            <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('82146674','1');return false;">
              All I Want for Christmas Is You</a>
            <a href="#" class="artist ellipsis" onclick="fnViewArtist('14937308');return false;">Mariah Carey</a>
            <i class="bar">|</i>
            <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('80384589');return false;">Merry Christmas (Deluxe Annivers
*/

public class MusicMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 데이터를 웹에서 읽기 
        // 저장 공간 
        ArrayList<Music> list = new ArrayList<Music>();
        try {
            // 사이트의 데이터 읽기 ==> 
            // https://www.genie.co.kr/chart/top200?ditc=D&ymd=20211224&hh=14&rtm=Y&pg=3
            int k = 1;
            for (int i = 1; i <= 4; i++) {
                // <a>
                Document doc = Jsoup
                        .connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20211224&hh=14&rtm=Y&pg=" + i).get(); // 사이트에 있는 데이터 읽기 
                Elements title = doc.select("td.info a.title");
                Elements singer = doc.select("td.info a.artist");
                Elements album = doc.select("td.info a.albumtitle");
                Elements etc = doc.select("span.rank");

                for (int j = 0; j < title.size(); j++) {
                    try {
                        System.out.println(k);
                        System.out.println(title.get(j).text());
                        System.out.println(singer.get(j).text());
                        System.out.println(album.get(j).text());
                        String temp = etc.get(j).text();
                        String state = temp.replaceAll("[^가-힣]", "");
                        String id = temp.replaceAll("[^0-9]", "");
                        if (state.equals("유지")) {
                            id = "0";// 등폭이 없다 
                        }
                        System.out.println("등폭:" + id);
                        System.out.println("상태:" + state);
                        System.out.println("\n");

                        // ArrayList에 저장
                        Music m = new Music();
                        m.setNo(k);
                        m.setTitle(title.get(j).text());
                        m.setSinger(singer.get(j).text());
                        m.setAlbum(album.get(j).text());
                        m.setState(state);
                        m.setIdcrment(Integer.parseInt(id));
                        list.add(m);
                        k++;
                    } catch (Exception ex) {
                    }
                }

            }
            // 객체 단위 저장 
            FileOutputStream fos = new FileOutputStream("c:\\javaDev\\data\\music_object.txt");
            // 파일 자동 생성이 된다 
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            // 닫기
            fos.close();
            oos.close();
            System.out.println("파일 저장 완료!!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}