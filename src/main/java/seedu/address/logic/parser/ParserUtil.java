package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import seedu.address.commons.core.index.Index;
import seedu.address.commons.util.StringUtil;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.contact.Email;
import seedu.address.model.contact.Name;
import seedu.address.model.contact.Telegram;
import seedu.address.model.module.ModularCredits;
import seedu.address.model.module.ModuleName;
import seedu.address.model.module.ZoomLink;
import seedu.address.model.module.grade.Assignment;
import seedu.address.model.module.grade.Grade;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods used for parsing strings in the various *Parser classes.
 */
public class ParserUtil {

    public static final String MESSAGE_INVALID_INDEX = "Index is not a non-zero unsigned integer.";

    /**
     * Parses {@code oneBasedIndex} into an {@code Index} and returns it. Leading and trailing whitespaces will be
     * trimmed.
     * @throws ParseException if the specified index is invalid (not non-zero unsigned integer).
     */
    public static Index parseIndex(String oneBasedIndex) throws ParseException {
        String trimmedIndex = oneBasedIndex.trim();
        if (!StringUtil.isNonZeroUnsignedInteger(trimmedIndex)) {
            throw new ParseException(MESSAGE_INVALID_INDEX);
        }
        return Index.fromOneBased(Integer.parseInt(trimmedIndex));
    }

    /**
     * Parses a {@code String name} into a {@code Name}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code name} is invalid.
     */
    public static Name parseName(String name) throws ParseException {
        requireNonNull(name);
        String trimmedName = name.trim();
        if (!Name.isValidName(trimmedName)) {
            throw new ParseException(Name.MESSAGE_CONSTRAINTS);
        }
        return new Name(trimmedName);
    }

    /**
     * Parses a {@code String email} into an {@code Email}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code email} is invalid.
     */
    public static Email parseEmail(String email) throws ParseException {
        requireNonNull(email);
        String trimmedEmail = email.trim();
        if (!Email.isValidEmail(trimmedEmail)) {
            throw new ParseException(Email.MESSAGE_CONSTRAINTS);
        }
        return new Email(trimmedEmail);
    }

    /**
     * Parses a {@code String telegramUsername} into an {@code Telegram}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code telegramUsername} is invalid.
     */
    public static Telegram parseTelegram(String telegramUsername) throws ParseException {
        requireNonNull(telegramUsername);
        String trimmedTelegram = telegramUsername.trim();
        if (!Telegram.isValidTelegram(trimmedTelegram)) {
            throw new ParseException(Telegram.MESSAGE_CONSTRAINTS);
        }
        return new Telegram(trimmedTelegram);
    }

    /**
     * Parses a {@code String tag} into a {@code Tag}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code tag} is invalid.
     */
    public static Tag parseTag(String tag) throws ParseException {
        requireNonNull(tag);
        String trimmedTag = tag.trim();
        if (!Tag.isValidTagName(trimmedTag)) {
            throw new ParseException(Tag.MESSAGE_CONSTRAINTS);
        }
        return new Tag(trimmedTag);
    }

    /**
     * Parses {@code Collection<String> tags} into a {@code Set<Tag>}.
     */
    public static Set<Tag> parseTags(Collection<String> tags) throws ParseException {
        requireNonNull(tags);
        final Set<Tag> tagSet = new HashSet<>();
        for (String tagName : tags) {
            tagSet.add(parseTag(tagName));
        }
        return tagSet;
    }

    /**
     * Parses a {@code String name} into a {@code Name}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code name} is invalid.
     */
    public static ModuleName parseModuleName(String name) throws ParseException {
        requireNonNull(name);
        String trimmedName = name.trim();
        if (!ModuleName.isValidName(trimmedName)) {
            throw new ParseException(ModuleName.MESSAGE_CONSTRAINTS);
        }
        return new ModuleName(trimmedName);
    }

    /**
     * Parses a {@code String zoomLink} into a {@code ZoomLink}.
     * Leading and trailing whitespaces will be trimmed.
     *
     * @throws ParseException if the given {@code zoomLink} is invalid.
     */
    public static ZoomLink parseZoomLink(String zoomLink) throws ParseException {
        requireNonNull(zoomLink);
        String trimmedZoomLink = zoomLink.trim();
        if (!ZoomLink.isValidZoomLink(trimmedZoomLink)) {
            throw new ParseException(ZoomLink.MESSAGE_CONSTRAINTS);
        }
        return new ZoomLink(trimmedZoomLink);
    }

    /**
     * Parses a {@code String assignmentName}.
     * Leading and trailing whitespaces will be trimmed.
     */
    public static String parseAssignmentName(String assignmentName) throws ParseException {
        String trimmedAssignmentName = assignmentName.trim();
        if (!Assignment.isValidAssignmentName(trimmedAssignmentName)) {
            throw new ParseException(Assignment.MESSAGE_ASSIGNMENT_NAME_CONSTRAINTS);
        }
        return trimmedAssignmentName;
    }

    /**
     * Parses a {@code String assignmentPercentage}.
     * Leading and trailing whitespaces will be trimmed.
     */
    public static double parseAssignmentPercentage(String assignmentPercentage) throws ParseException {
        double trimmedAssignmentPercentage = Double.parseDouble(assignmentPercentage.trim());
        if (!Assignment.isValidAssignmentPercentage(trimmedAssignmentPercentage)) {
            throw new ParseException(Assignment.MESSAGE_ASSIGNMENT_PERCENTAGE_CONSTRAINTS);
        }
        return trimmedAssignmentPercentage;
    }

    /**
     * Parses a {@code String assignmentResult}.
     * Leading and trailing whitespaces will be trimmed.
     */
    public static double parseAssignmentResult(String assignmentResult) throws ParseException {
        double trimmedAssignmentResult = Double.parseDouble(assignmentResult.trim());
        if (!Assignment.isValidAssignmentResult(trimmedAssignmentResult)) {
            throw new ParseException(Assignment.MESSAGE_ASSIGNMENT_RESULT_CONSTRAINTS);
        }
        return trimmedAssignmentResult;
    }

    /**
     * Parses a {@code String modularCredits}.
     * Leading and trailing whitespaces will be trimmed.
     */
    public static ModularCredits parseModularCredits(String modularCredits) throws ParseException {
        double trimmedModularCredits;
        if (!ModularCredits.isValidModularCredits(modularCredits)) {
            throw new ParseException(Assignment.MESSAGE_ASSIGNMENT_RESULT_CONSTRAINTS);
        } else {
            trimmedModularCredits = Double.parseDouble(modularCredits.trim());
        }
        return new ModularCredits(trimmedModularCredits);
    }
    /**
     * Parses a {@code String grade}.
     * Leading and trailing whitespaces will be trimmed.
     */
    public static double parseGrade(String grade) throws ParseException {
        double trimmedGrade = Double.parseDouble(grade.trim());
        if (!Grade.isValidGrade(trimmedGrade)) {
            throw new ParseException(Grade.MESSAGE_CONSTRAINTS);
        }
        return trimmedGrade;
    }
}
