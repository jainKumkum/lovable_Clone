package com.codingshuttle.projects.lovable_clone.repository;

import com.codingshuttle.projects.lovable_clone.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("NullableProblems")
public interface ProjectRepository extends  JpaRepository<Project, Long> {
    @Query("""
            SELECT p FROM Project p
            WHERE p.deletedAt IS NULL
            AND p.owner.id = :userId
            ORDER BY p.updatedAt DESC
            """)
    List<Project> findAllAccessibleByUser(@Param("userId") Long userId);

    @Query("""
    SELECT p FROM Project p
    WHERE p.deletedAt IS NULL
      AND p.id = :id
      AND p.owner.id = :userId
    """)
    Project findProjectByIdAndOwnerId(
            @Param("id") Long id,
            @Param("userId") Long userId
    );
    Optional<Project> findByIdAndOwner_IdAndDeletedAtIsNull(Long id, Long ownerId);
//    Optional<Project> findByProjectIdAndUserId(Long projectId, Long userId);
}
