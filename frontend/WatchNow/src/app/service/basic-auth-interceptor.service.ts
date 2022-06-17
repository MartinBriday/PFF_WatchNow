import { HttpInterceptor, HttpRequest, HttpHandler } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BasicAuthHtppInterceptorService implements HttpInterceptor {

  constructor() { }

  intercept(req: HttpRequest<any>, next: HttpHandler) {

    if (sessionStorage.getItem('username') && sessionStorage.getItem('token')) {
      var token = sessionStorage.getItem('token')
      token = token === null ? "" : token;
      req = req.clone({
        setHeaders: {
          Authorization: token
        }
      })
    }

    return next.handle(req);

  }
}
