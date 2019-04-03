import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Response } from '@angular/http';
import { map } from 'rxjs/operators';

@Injectable()
export class FeedService {

  constructor(public http: HttpClient) {
  }

  getLocalClubs() {
    return this.http.get('http://localhost:8080/getClubs')
    .pipe(map((response: Response) => response.json()));
  }
}
