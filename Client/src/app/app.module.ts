import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';

import { IonicModule, IonicRouteStrategy } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { FeedPageModule } from './feed/feed.module';
import { PostPageModule } from './post/post.module';
import { FeedService } from './feed.service';
<<<<<<< HEAD
import { HttpClientModule } from '@angular/common/http';

=======
>>>>>>> 6404fa791ad71dd0cb6b91144ac0b8ed90d7d670

@NgModule({
  declarations: [AppComponent],
  entryComponents: [],
  imports: [
    BrowserModule, 
    IonicModule.forRoot(),
    AppRoutingModule,
<<<<<<< HEAD
    HttpClientModule,
=======
>>>>>>> 6404fa791ad71dd0cb6b91144ac0b8ed90d7d670
    FeedPageModule,
    PostPageModule,
  ],
  providers: [
    FeedService,
    StatusBar,
    SplashScreen,
    { provide: RouteReuseStrategy, useClass: IonicRouteStrategy }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
