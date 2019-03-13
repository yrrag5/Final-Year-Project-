import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { map } from 'rxjs/operators';

@Injectable()
export class FeedService {

  constructor(public http: Http) {
  }

  getLocalClubs() {
    return this.http.get('http://localhost:8080/club')
    .pipe(map((response: Response) => response.json()));
  }
}
