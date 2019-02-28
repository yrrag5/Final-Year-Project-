<<<<<<< HEAD
import { NavController, NavParams } from '@ionic/angular';
import { Component, OnInit } from '@angular/core';
import { FeedService } from '../feed.service';
=======
import { Component, OnInit } from '@angular/core';
>>>>>>> 6404fa791ad71dd0cb6b91144ac0b8ed90d7d670

@Component({
  selector: 'app-feed',
  templateUrl: './feed.page.html',
  styleUrls: ['./feed.page.scss'],
})
<<<<<<< HEAD
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
=======
export class FeedPage implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
>>>>>>> 6404fa791ad71dd0cb6b91144ac0b8ed90d7d670
