import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { FeedService } from '../../providers/feed.service';


@Component({
  selector: 'app-feed',
  templateUrl: './feed.page.html',
  styleUrls: ['./feed.page.scss'],
})
export class FeedPage {
  private clubs: Array<any>;
  
  constructor(router : Router, public feedService : FeedService) { }

  IonViewDidLoad() {
    this.feedService.getLocalClubs().subscribe(clubs => {
      this.clubs = clubs;
    })
  }

}
