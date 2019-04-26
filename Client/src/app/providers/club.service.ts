import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map, filter } from 'rxjs/operators';
import { Observable } from 'rxjs';


@Injectable()
export class ClubService {

  public API = 'http://localhost:8080';

  constructor(public http: HttpClient) {
  }

  getClubs(): Observable<any> {
    return this.http.get(this.API + "/clubs")
      .pipe(map((clubs: any) => {
          console.log("Club table: ", clubs);
          return clubs;
        }, error => {
          console.log(error);
        })
      ); 
  }

  postClubs(formData: FormData) {
    
    this.http.post(this.API + "/clubs", formData)
      .subscribe(data => {
        console.log(data['_body']);
      }, error => {
        console.log(error);
      });
  }

}
