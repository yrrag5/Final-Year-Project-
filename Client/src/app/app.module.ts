import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouteReuseStrategy } from '@angular/router';
import { IonicModule, IonicRouteStrategy } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { LoginPageModule }  from './pages/login/login.module';
import { FeedPageModule }   from './pages/feed/feed.module';
import { PostPageModule }   from './pages/post/post.module';
import { FeedService }      from './providers/feed.service';
import { HttpClientModule } from '@angular/common/http';
import { ClubService } from './providers/club.service';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [AppComponent],
  entryComponents: [],
  imports: [
    BrowserModule, 
    IonicModule.forRoot(),
    AppRoutingModule,
    HttpClientModule,
    LoginPageModule,
    FeedPageModule,
    PostPageModule,
    FormsModule, 
    ReactiveFormsModule
  ],
  providers: [
    FeedService,
    ClubService,
    StatusBar,
    SplashScreen,
    { provide: RouteReuseStrategy, useClass: IonicRouteStrategy }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
