//
//  Stack.swift
//  demo_01
//
//  Created by DREAMWORLD on 08/02/23.
//

import SwiftUI

struct Stack: View {
    var body: some View {
        
        ZStack{
            Rectangle()
                .fill(Color.red)
                .frame(alignment: .center)
            VStack{
                Rectangle()
                    .fill(Color.green)
                    .frame(width:100,height: 100)
                Rectangle()
                    .fill(Color.green)
                    .frame(width:100,height: 100)
                HStack{
                    Rectangle()
                        .fill(Color.green)
                        .frame(width:100,height: 100)
                    Spacer()
                    Rectangle()
                        .fill(Color.green)
                        .frame(width:100,height: 100)

                }
               
            }
        }
        
    }
}

struct Stack_Previews: PreviewProvider {
    static var previews: some View {
        Stack()
    }
}
