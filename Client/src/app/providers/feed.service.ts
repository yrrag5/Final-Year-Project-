import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';


@Injectable()
export class FeedService {

  public API = 'http://localhost:8080';

  constructor(public http: HttpClient) {
  }

  // HTTP get users method. Returns an observable that you have to subscribe to in order to get the data.
  getUsers(): Observable<any> {
    return this.http.get(this.API + "/users")
        .pipe(map((users: any) => {
            console.log("User table: ", users);
            return users;
        }, error => {
          console.log(error);
        })
     );  
  }

  // HTTP post user method.
  postUsers(formData: FormData) {
    this.http.post(this.API + "/clubs", formData)
      .subscribe(data => {
        console.log(data['_body']);
      }, error => {
        console.log(error);
      });
  }

}
