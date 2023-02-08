//
//  MainView.swift
//  demo_01
//
//  Created by DREAMWORLD on 06/02/23.
//

import SwiftUI

struct MainView: View {
    var body: some View {
        
        Image(systemName: "heart.fill")
            .font(.system(size: 40))
            .background(
                Circle()
                    .fill(LinearGradient(colors: [Color.red,Color.green], startPoint: .leading, endPoint: .trailing))
                    .frame(width: 100,height: 100)
                
            )
            .shadow(color:Color.green	, radius: 10,x: 0.0,y: 20)
            
            
    }
}

struct MainView_Previews: PreviewProvider {
    static var previews: some View {
        MainView()
        
    }
}
