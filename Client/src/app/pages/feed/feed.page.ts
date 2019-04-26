import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FeedService } from '../../providers/feed.service';
import { ClubService } from '../../providers/club.service';


@Component({
  selector: 'app-feed',
  templateUrl: './feed.page.html',
  styleUrls: ['./feed.page.scss'],
  providers: [FeedService]
})

export class FeedPage implements OnInit {
  private clubs: Array<any>;
  private users: Array<any>;
  names : Array<string>;

  constructor(router : Router, public feedService : FeedService, clubService : ClubService) { }

  ngOnInit() {
    
    this.feedService.getUsers()
      .subscribe((data) => {
        this.users = data;
        console.log("user names: ");
        console.log(this.users);
    })

    this.feedService.getClubs().subscribe(data => {
      this.clubs = data;
      console.log("Club names: ");
      console.log(this.clubs);
    })
  
  }

}
