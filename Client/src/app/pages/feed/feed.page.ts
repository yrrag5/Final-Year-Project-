import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FeedService } from '../../providers/feed.service';

@Component({
  selector: 'app-feed',
  templateUrl: './feed.page.html',
  styleUrls: ['./feed.page.scss'],
})

export class FeedPage implements OnInit {
  private clubs: Array<any>;
  private users: Array<any>;
  names : Array<string>;

  constructor(router : Router, public feedService : FeedService) { }

ngOnInit() {
  
  this.feedService.getUsers().subscribe(users => {
    console.log("user names: ");
    console.log(users);
  })
}

/*
  IonViewDidLoad() {
    this.feedService.getUserNames().subscribe(users => this.users = users);

    console.log("before mapping ", this.users);

    this.names = ["hugh", "garry", "darragh"];
  }*/

}
