package com.example.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.adapter.TarefaAdapter
import com.example.todolist.databinding.FragmentListBinding
import com.example.todolist.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        val listTarefas = listOf(
            Tarefa(
                "Lavar a Louça",
                "Lavar a louça toda",
                "Eu",
            "2022-05-15",
                true,
                "Dia-a-Dia"
            ),Tarefa(
                "Varrer a casa",
                "Varrer a casa toda",
                "Eu",
            "2022-05-15",
                false,
                "Final de Semana"
            ),Tarefa(
                "Verificar o lixo",
                "Tirar o lixo quando necessário",
                "Eu",
            "2022",
                true,
                "Dia-a-Dia"
            )
        )

        //Config do RecyclerView
        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }
}