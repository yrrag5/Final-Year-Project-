import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FeedService } from '../../providers/feed.service';
import { ClubService } from '../../providers/club.service';

@Component({
  selector: 'app-feed',
  templateUrl: './feed.page.html',
  styleUrls: ['./feed.page.scss'],
  providers: [FeedService, ClubService]
})

export class FeedPage implements OnInit {
  private clubs: Array<any>;
  private users: Array<any>;

  // Called first.
  constructor(router : Router, public feedService : FeedService, 
    public clubService : ClubService) { }

  // Called after the constructor 
  ngOnInit() {
    
    this.feedService.getUsers()
      .subscribe((data) => {
        this.users = data;
        console.log("user names: ");
        console.log(this.users);
    })

    this.clubService.getClubs()
      .subscribe(data => {
        this.clubs = data;
        console.log("Club names: ");
        console.log(this.clubs);
    })
  
  }

}
