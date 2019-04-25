import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, filter } from 'rxjs/operators';
import { Observable } from 'rxjs';


@Injectable()
export class FeedService {

  public API = 'http://localhost:8090';

  constructor(public http: HttpClient) {
  }

  getClubs(): Observable<any> {
    return this.http.get(this.API + "/clubs")
      .pipe(map((clubs: any) => {
          console.log("Club table: ", clubs);
          return clubs;
        })
      ); 
  }

  getUsers(): Observable<any> {
    return this.http.get(this.API + "/users")
        .pipe(map((users: any) => {
            console.log("User table: ", users);
            return users;
        })
     );  
}
}
