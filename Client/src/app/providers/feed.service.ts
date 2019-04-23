import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Response } from '@angular/http';
import { map, filter } from 'rxjs/operators';
import { Observable } from 'rxjs';


@Injectable()
export class FeedService {

  public API = 'http://localhost:8090';

  constructor(public http: HttpClient) {
  }

  getLocalClubs() {
    return this.http.get(
      this.API + '/club'
      );
  }

  getUsers() {
    return this.http.get (this.API + "/get")
      .pipe(map((users: any) => {
          console.log("User table: ", users);
          return users.userId;
        }), filter((user: any) => {
          return true;
        })
      ); 
  }
}
