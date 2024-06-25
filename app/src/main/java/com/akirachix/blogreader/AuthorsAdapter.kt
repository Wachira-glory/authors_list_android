package com.akirachix.blogreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AuthorsAdapter(val authorsList: List<Authors>):RecyclerView.Adapter<AuthorsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorsViewHolder {
       var itemView = LayoutInflater.from(parent.context)
           .inflate(R.layout.author_list_item,parent, false)
        return AuthorsViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return authorsList.size
    }

    override fun onBindViewHolder(holder: AuthorsViewHolder, position: Int) {
        val author = authorsList[position]
        holder.tvName.text=author.articleName
        holder.tvLink.text = author.link
        holder.tvArticleName.text = author.articleName
        holder.tvPublishDate.text = author .publishDate
        holder.tvArticlePreview.text = author.articlePreview


    }


}
class AuthorsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
//    var tvName = itemView.findViewById<TextView>(R.id.tvName)
//    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
//    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
//    var ivAvatar =itemView.findViewById<TextView>(R.id.ivAvatar)
    var tvName:TextView = itemView.findViewById(R.id.tvName)
//    var ivArticlePhoto = itemView.findViewById<TextView>(R.id.ivArticlePhoto)
    var tvArticleName:TextView = itemView.findViewById(R.id.tvArticleName)
    var tvPublishDate:TextView = itemView.findViewById(R.id.tvPublishDate)
    var tvArticlePreview:TextView = itemView.findViewById(R.id.tvArticlePreview)
    var tvLink:TextView = itemView.findViewById(R.id.tvLink)
}
