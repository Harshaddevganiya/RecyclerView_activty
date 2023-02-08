//
//  Spacer.swift
//  demo_01
//
//  Created by DREAMWORLD on 08/02/23.
//

import SwiftUI

struct SpacerUI: View {
    var body: some View {
        VStack {
            HStack(spacing:0){
       
                Image(systemName: "xmark")
                Spacer()
                Image(systemName: "gear")
                
            }
            .font(.title)
        .background(Color.yellow)
            
            Spacer()  
        }
        
        
    }
}

struct Spacer_Previews: PreviewProvider {
    static var previews: some View {
        SpacerUI()
    }
}
