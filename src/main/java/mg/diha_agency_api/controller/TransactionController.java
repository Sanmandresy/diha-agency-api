package mg.diha_agency_api.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import mg.diha_agency_api.model.Transaction;
import mg.diha_agency_api.service.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TransactionController {

  private TransactionService service;

  @GetMapping("/transactions")
  public List<Transaction> getTransactions() {
    return service.getTransactions();
  }

  @GetMapping("/transactions/{transaction_id}")
  public Transaction getTransactionById(@PathVariable("transaction_id")Long transactionId) {
    return service.getTransactionById(transactionId);
  }

  @PostMapping("/transactions")
  public Transaction createNewTransaction(Transaction newTransaction) {
    return service.createNewTransaction(newTransaction);
  }

}
