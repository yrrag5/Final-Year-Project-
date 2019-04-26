import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FeedService } from '../../providers/feed.service';


@Component({
  selector: 'app-post',
  templateUrl: './post.page.html',
  styleUrls: ['./post.page.scss'],
})
export class PostPage implements OnInit {

  constructor(router : Router, public feedService : FeedService) { }

  sendPostRequest() {
    let postData = { 
      
    }
  }

  ngOnInit() {

  }

}
