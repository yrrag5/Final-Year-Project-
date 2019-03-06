import { NavController, NavParams } from '@ionic/angular';
import { Component, OnInit } from '@angular/core';
import { FeedService } from '../feed.service';

@Component({
  selector: 'app-feed',
  templateUrl: './feed.page.html',
  styleUrls: ['./feed.page.scss'],
})
export class FeedPage {
  private clubs: Array<any>;

  constructor(public navCtrl: NavController, public navParams: NavParams,
    public feedService: FeedService) { }

  ionViewDidLoad() {
    this.feedService.getClubs().subscribe(clubs => {
      this.clubs = clubs;
    })
  }

}
