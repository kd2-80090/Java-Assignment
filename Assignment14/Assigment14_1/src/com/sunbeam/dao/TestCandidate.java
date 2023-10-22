package com.sunbeam.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TestCandidate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id to be deleted: ");
			int id = sc.nextInt();
			int cnt = dao.deleteById(id);
			System.out.println("Candidates deleted: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try(CandidateDao dao = new CandidateDao()) {
			List<Candidate> list = dao.findAll();
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/

		/*
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter party: ");
			String party = sc.next();
			List<Candidate> list = dao.findByParty(party);
			list.forEach(c -> System.out.println(c));
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try(CandidateDao dao = new CandidateDao()) {
			System.out.print("Enter candidate id (to vote): ");
			int candidateId = sc.nextInt();
			int cnt = dao.incrementVote(candidateId);
			System.out.println("Rows updated: " + cnt);
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try(CandidateDao dao1 = new CandidateDao()) {
			Candidate c = new Candidate();
			System.out.print("Enter name :");
			c.setName(sc.next());
			System.out.print("Enter party :");
			c.setParty(sc.next());
			System.out.print("Enter votes :");
			c.setVotes(sc.nextInt());
			int cnt = dao1.save(c);
			System.out.println("Rows inserted:"+cnt);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try(CandidateDao dao2 = new CandidateDao()) {
			Candidate c = new Candidate();
			System.out.print("Enter candidate id to modify name and party:");
			c.setId(sc.nextInt()); 
			System.out.print("Enter name :");
			c.setName(sc.next());
			System.out.print("Enter party :");
			c.setParty(sc.next());
			int cnt = dao2.update(c);
			System.out.println("Rows updated: "+cnt);
		}
		catch (Exception e2) {
			e2.printStackTrace();
		}
		*/
		
		try(CandidateDao dao3 = new CandidateDao()) {
			List<PartyVotes> list = dao3.getPartywiseVotes();
			list.forEach(p -> System.out.println(p));
			
		} // dao.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}






