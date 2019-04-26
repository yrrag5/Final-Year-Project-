import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FeedService } from '../../providers/feed.service';
import { ClubService } from 'app/providers/club.service';
import { FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-post',
  templateUrl: './post.page.html',
  styleUrls: ['./post.page.scss'],
  providers: [FeedService, ClubService]
})
export class PostPage implements OnInit {

  constructor(router : Router, public feedService : FeedService, public clubService : ClubService) { }

  sendPostRequest() {
    let postData = { 
      
    }
  }

  ngOnInit() {
  }

}
