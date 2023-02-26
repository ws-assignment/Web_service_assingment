import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-book-component',
  templateUrl: './book-component.component.html',
  styleUrls: ['./book-component.component.css']
})
export class BookComponentComponent implements OnInit{
  books:any;
  constructor(private http:HttpClient){}

  ngOnInit(): void {
    let res = this.http.get("http://localhost:8080/findAll")
    res.subscribe((data)=>this.books=data)
  }

}
