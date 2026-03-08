package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiReleaseNotes: ImageVector
    get() {
        if (_SiReleaseNotes != null) {
            return _SiReleaseNotes!!
        }
        _SiReleaseNotes = ImageVector.Builder(
            name = "Duotone.SiReleaseNotes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(4f, 3.4f)
                verticalLineToRelative(17.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 23f)
                horizontalLineToRelative(11.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(3.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.6f, 1f)
                horizontalLineTo(6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 3.4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(9f, 8f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
                moveTo(9f, 16f)
                lineToRelative(2f, 2f)
                lineToRelative(4f, -4f)
                moveTo(4f, 20.6f)
                verticalLineTo(3.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.4f, 1f)
                horizontalLineToRelative(11.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 3.4f)
                verticalLineToRelative(17.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20.6f)
            }
        }.build()

        return _SiReleaseNotes!!
    }

@Suppress("ObjectPropertyName")
private var _SiReleaseNotes: ImageVector? = null
