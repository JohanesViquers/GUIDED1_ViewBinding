package com.example.view_binding_09653

class MainAdapter (val tasklist: List<Task>):RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    inner class MainViewHolder (val itemBinding: RecyclerviewItemBinding)
        :RecyclerView.ViewHolder(itemBinding.root) {

        fun bindItem(task: Task) {
            itemBinding.chapter.text = task.chapter
            itemBinding.itemTitle.text = task.title
            itemBinding.itemDetail.text = task.details

        }
    }

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder (RecyclerviewItemBinding.inflate (LayoutInflater.from (parent.context),parent, attachToParent: false))
}

    override fun onBindViewHolder (holder: MainViewHolder, position: Int) {
        val task = taskList[position]
        holder.bindItem(task)
    }
    override fun getItemCount(): Int {
        return tasklist.size
    }