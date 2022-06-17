import { AuthenticationService } from './../../service/authentication.service';
import { Router } from '@angular/router';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username = ''
  password = ''
  invalidLogin = false

  @Input() error!: string | null;

  constructor(private router: Router,
    private loginservice: AuthenticationService) { }

  ngOnInit() {
  }

  checkLogin() {
    (this.loginservice.authenticate(this.username, this.password).subscribe(
      data => {
        this.router.navigate(['accueil'])
        this.invalidLogin = false
      },
      error => {
        this.invalidLogin = true
        this.error = error.message;

      }
    )
    );

  }

}
