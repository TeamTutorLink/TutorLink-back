package com.tutorlink.api.lesson.domain;

import com.tutorlink.api.user.domain.User;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Table(name = "user_lesson_like", indexes = @Index(columnList = "user_id, lesson_id"))
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@DynamicInsert
public class UserLessonLike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_lesson_like_id")
    int userLessonLikeId;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @NonNull
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    Lesson lesson;
}
