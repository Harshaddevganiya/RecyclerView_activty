//
//  InitDemo.swift
//  demo_01
//
//  Created by DREAMWORLD on 08/02/23.
//

import SwiftUI

struct InitDemo: View {
    
    let bg:Color
    let count:Int
    let title:String
    
    init( count: Int, fruit:Fruit) {
        self.count = count
    
        if(fruit == .apple){
            self.title = "Apple"
            self.bg = .red
        }else{
            self.title = "Orange"
            self.bg = .orange
        }
        
    }
    
    enum Fruit{
        case apple
        case orange
    }
    
    var body: some View {
        VStack{
            
            Text("\(count)")
                .font(.largeTitle)
                .foregroundColor(Color.white)
                .underline()
            Text(title)
                .font(.headline)
                .foregroundColor(Color.white)

            
        }
        .frame(width: 150,height: 150)
        .background(bg)
        .cornerRadius(10)
    }
}

struct InitDemo_Previews: PreviewProvider {
    static var previews: some View {
        InitDemo(count: 4, fruit: .orange)
    }
}
