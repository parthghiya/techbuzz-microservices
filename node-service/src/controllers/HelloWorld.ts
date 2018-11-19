import { Controller, Get, JsonController } from 'routing-controllers';

@Controller('')
export class HelloWorld {

constructor(){}    

@Get('/')
async getTest(): Promise<any> {
  return {"msg":"Not Valid Path"}
}    

@Get('/nodejs-microservice')
async get(): Promise<any> {
  return {"msg":"Hello From Node.js"}
}    

}
    
