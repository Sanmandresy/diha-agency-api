package mg.diha_agency_api.service;


import java.util.List;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Transaction;
import mg.diha_agency_api.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionService {

  private TransactionRepository repository;

  public List<Transaction> getTransactions() {
    return repository.getTransactions();
  }

  public Transaction getTransactionById(Long transactionId) {
    return repository.getTransactionByTransactionId(transactionId);
  }

  public Transaction createNewTransaction(Transaction newTransaction) {
    return repository.save(newTransaction);
  }
}
