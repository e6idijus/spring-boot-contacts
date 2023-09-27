package lt.techin.contacts.repositories;

import lt.techin.contacts.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
