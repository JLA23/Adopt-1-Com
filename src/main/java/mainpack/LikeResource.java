package mainpack;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import mainpack.Items.Like;
import mainpack.Items.LikeDto;

import com.adopt.bdd.LikeDao;

@Path("like")
public class LikeResource {
	private static LikeDao dao = Init.getInstance().getLikeDao();
	
		@POST 
		public void action (LikeDto likeDto){
			Like like = new Like(likeDto.getItemid(), likeDto.getUserid(), likeDto.getItemType(), likeDto.getAime());
			dao.insert(like);
		}
		
}
