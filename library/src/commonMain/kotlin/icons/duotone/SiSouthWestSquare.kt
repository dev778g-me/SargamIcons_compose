package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiSouthWestSquare: ImageVector
    get() {
        if (_SiSouthWestSquare != null) {
            return _SiSouthWestSquare!!
        }
        _SiSouthWestSquare = ImageVector.Builder(
            name = "Duotone.SiSouthWestSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(18.6f, 3f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.4f)
                verticalLineToRelative(13.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.4f, 21f)
                horizontalLineToRelative(13.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.6f, 3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(16f, 8f)
                lineToRelative(-8f, 8f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(-5f)
                moveToRelative(0f, 5f)
                horizontalLineToRelative(5f)
                moveTo(5.4f, 3f)
                horizontalLineToRelative(13.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5.4f)
                verticalLineToRelative(13.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.6f)
                verticalLineTo(5.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 3f)
            }
        }.build()

        return _SiSouthWestSquare!!
    }

@Suppress("ObjectPropertyName")
private var _SiSouthWestSquare: ImageVector? = null
