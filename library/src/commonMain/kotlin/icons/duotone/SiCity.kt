package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiCity: ImageVector
    get() {
        if (_SiCity != null) {
            return _SiCity!!
        }
        _SiCity = ImageVector.Builder(
            name = "Duotone.SiCity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(9f, 19.6f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineToRelative(17.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, 22f)
                horizontalLineToRelative(2.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 19.6f)
                moveTo(23f, 19.6f)
                verticalLineTo(5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(14.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, 2.4f)
                horizontalLineToRelative(2.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 2f)
                verticalLineToRelative(17.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, 22f)
                horizontalLineToRelative(2.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 19.6f)
                verticalLineTo(2f)
                horizontalLineTo(1f)
                moveToRelative(15f, 3f)
                verticalLineToRelative(14.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(6.4f)
                moveToRelative(7f, 0f)
                horizontalLineToRelative(7.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(5f)
                horizontalLineToRelative(-8f)
                moveToRelative(-6f, 6f)
                horizontalLineToRelative(7f)
                moveTo(5f, 6f)
                horizontalLineToRelative(1f)
                moveTo(5f, 9f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 3f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 3f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 3f)
                horizontalLineToRelative(1f)
                moveToRelative(13f, -6f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, -3f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 6f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 3f)
                horizontalLineToRelative(1f)
                moveToRelative(-8f, 0f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, -3f)
                horizontalLineToRelative(1f)
            }
        }.build()

        return _SiCity!!
    }

@Suppress("ObjectPropertyName")
private var _SiCity: ImageVector? = null
