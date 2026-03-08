package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiHospitalAlt1: ImageVector
    get() {
        if (_SiHospitalAlt1 != null) {
            return _SiHospitalAlt1!!
        }
        _SiHospitalAlt1 = ImageVector.Builder(
            name = "Duotone.SiHospitalAlt1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.16f
            ) {
                moveTo(18f, 19.6f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(17.6f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.4f, 22f)
                horizontalLineTo(10f)
                verticalLineToRelative(-3.2f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, -0.8f)
                horizontalLineToRelative(2.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.8f, 0.8f)
                verticalLineTo(22f)
                horizontalLineToRelative(1.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 2f)
                verticalLineToRelative(4f)
                moveToRelative(0f, -4f)
                horizontalLineTo(6f)
                moveToRelative(12f, 0f)
                horizontalLineToRelative(1f)
                moveToRelative(-1f, 4f)
                verticalLineToRelative(13.6f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                moveTo(18f, 6f)
                horizontalLineToRelative(4f)
                moveToRelative(-6.4f, 16f)
                horizontalLineToRelative(4f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                verticalLineTo(6f)
                moveToRelative(-6.4f, 16f)
                horizontalLineTo(14f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-4f)
                moveToRelative(4f, 0f)
                verticalLineToRelative(-3.2f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, -0.8f)
                horizontalLineToRelative(-2.4f)
                arcToRelative(0.8f, 0.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.8f)
                verticalLineTo(22f)
                moveToRelative(0f, 0f)
                horizontalLineTo(8.4f)
                quadToRelative(-0.244f, 0f, -0.474f, -0.047f)
                moveToRelative(0f, 0f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19.6f)
                verticalLineTo(6f)
                moveToRelative(1.926f, 15.953f)
                horizontalLineTo(4.4f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, -2.4f)
                verticalLineTo(6f)
                moveToRelative(5.926f, 15.953f)
                horizontalLineTo(8.6f)
                moveTo(6f, 6f)
                verticalLineTo(2f)
                moveToRelative(0f, 4f)
                horizontalLineTo(2f)
                moveToRelative(4f, -4f)
                horizontalLineTo(5f)
                moveToRelative(17f, 4f)
                horizontalLineToRelative(1f)
                moveTo(2f, 6f)
                horizontalLineTo(1f)
                moveToRelative(11f, 0.5f)
                verticalLineToRelative(3f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(3f)
                moveToRelative(0f, -3f)
                horizontalLineTo(9f)
                moveToRelative(3f, 0f)
                horizontalLineToRelative(3f)
            }
        }.build()

        return _SiHospitalAlt1!!
    }

@Suppress("ObjectPropertyName")
private var _SiHospitalAlt1: ImageVector? = null
