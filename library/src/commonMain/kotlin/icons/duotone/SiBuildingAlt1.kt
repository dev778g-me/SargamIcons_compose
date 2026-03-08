package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiBuildingAlt1: ImageVector
    get() {
        if (_SiBuildingAlt1 != null) {
            return _SiBuildingAlt1!!
        }
        _SiBuildingAlt1 = ImageVector.Builder(
            name = "Duotone.SiBuildingAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(20f, 19.6f)
                verticalLineTo(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(17.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, 22f)
                horizontalLineTo(9f)
                verticalLineToRelative(-3.2f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -0.8f)
                horizontalLineToRelative(4.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, 0.8f)
                verticalLineTo(22f)
                horizontalLineToRelative(2.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 2f)
                verticalLineToRelative(17.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                horizontalLineTo(6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 19.6f)
                verticalLineTo(2f)
                moveToRelative(11f, 20f)
                verticalLineToRelative(-3.2f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineTo(9.8f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(22f)
                moveTo(3f, 2f)
                horizontalLineToRelative(18f)
                moveTo(8f, 6f)
                horizontalLineToRelative(2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                moveToRelative(-8f, 4f)
                horizontalLineToRelative(2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                moveToRelative(-8f, 4f)
                horizontalLineToRelative(2f)
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
            }
        }.build()

        return _SiBuildingAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiBuildingAlt1: ImageVector? = null
