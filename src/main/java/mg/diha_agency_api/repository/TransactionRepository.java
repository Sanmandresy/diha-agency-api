package mg.diha_agency_api.repository;

import java.util.List;
import mg.diha_agency_api.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

  Transaction getTransactionByTransactionId(Long transactionId);

  @Query("select t from Transaction t")
  List<Transaction> getTransactions();

}
